package kodlama.io.softwareLanguage.WebApi;

import kodlama.io.softwareLanguage.Business.Abstract.SoftwareLanguageService;
import kodlama.io.softwareLanguage.Entities.Concrete.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/softwareLanguage")
public class SoftwareLanguageController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLanguageController(SoftwareLanguageService softwareLanguageService) {
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguage> getAll(){
        return softwareLanguageService.getAll();
    }

    @GetMapping("/addLanguage")
    public List<SoftwareLanguage> addLanguage(int id,String name){
        return softwareLanguageService.addLanguage(id,name);
    }

    @GetMapping("/delete")
    public List<SoftwareLanguage> delete(int id){
        return softwareLanguageService.delete(id);
    }

    @GetMapping("/getById")
    public List<SoftwareLanguage> getById(int id){
        return softwareLanguageService.getById(id);
    }

    @GetMapping("/upgrade")
    public List<SoftwareLanguage> upgrade(int id,String name){
        return softwareLanguageService.upgrade(id,name);
    }

    @GetMapping("/addLanguage")
    public List<SoftwareLanguage> addTechnology(int id,String name,String Language){
        return softwareLanguageService.addTechnology(id,name,Language);
    }
}
