package kodlama.io.softwareLanguage.Business.Abstract;

import kodlama.io.softwareLanguage.Entities.Concrete.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageService {
    List<SoftwareLanguage> addLanguage(int id,String name);
    List<SoftwareLanguage> addTechnology(int id,String name,String subTechnology);
    List<SoftwareLanguage> delete(int id);
    List<SoftwareLanguage> getAll();
    List<SoftwareLanguage> getById(int id);
    List<SoftwareLanguage> upgrade(int id,String name);

}
