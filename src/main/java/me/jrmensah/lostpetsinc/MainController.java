package me.jrmensah.lostpetsinc;

import me.jrmensah.lostpetsinc.Pet;
import me.jrmensah.lostpetsinc.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {
    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String listPets(Model model){
        model.addAttribute("pet", petRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String loadPetForm(Model model){
        model.addAttribute("pet", new Pet());
        return "lostpetform";
    }

    @PostMapping("/process")
    public String processPetForm(@Valid Pet pet, BindingResult result)
    {
        if(result.hasErrors()){
            return "lostpetform";
        }
        petRepository.save(pet);
        return "redirect:/";

    }
    @RequestMapping("/detail/{id}")
    public String showPet(@PathVariable("id") long id, Model model){
        model.addAttribute("pet", petRepository.findOne(id));
        return "show";
    }
    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id, Model model){
        model.addAttribute("person", petRepository.findOne(id));
        return "lostpetform";
    }
    @RequestMapping("/delete/{id}")
    public String delPet(@PathVariable("id") long id){
        petRepository.delete(id);
        return "redirect:/";
    }
}

