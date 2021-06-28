package com.example.demo.noctroller;

import com.example.demo.pc.*;
import com.example.demo.pc.procesors.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class pcController {
    @RequestMapping("/")
    public String showForm(Model theModel){
        //nowy obiekt
       pc thePC = new pc();

        //obiekt dodac do modelu;
        theModel.addAttribute("pc",thePC);
        return "pc-form";
    }

    @RequestMapping("processForm")
    public String prossesForm(@ModelAttribute("pc") pc thePc) throws FileNotFoundException {
        Procesors procesor;
        Cases obudowa;
        Gpu gpu1;

        obudowa = Printer.ChoosCase(thePc.cas);
        gpu1 =  Printer.ChoosGpu(thePc.gpu);
        procesor = Printer.ChoosProcesor(thePc.pro);
        PC pc1 = new PcAssembler(procesor,obudowa,gpu1);
        ArrayList arra = Printer.printerF(pc1);
        Printer.print(Printer.printerF(pc1));
        thePc.setArra(Printer.printerF(pc1));

        return "pc-confirmation";


    }


}
