package kodlama.io.softwareLanguage.DataAccess.Abstract;

import kodlama.io.softwareLanguage.Entities.Concrete.SoftwareLanguage;

import java.util.List;

public interface SoftwareLanguageRepository {
    List<SoftwareLanguage> addLanguage(int id, String name);

    List<SoftwareLanguage> addTechnology(int id,String name,String technology);

    List<SoftwareLanguage> delete(int id);
    List<SoftwareLanguage> upgrade(int id,String name);

    List<SoftwareLanguage> getAll();

    List<SoftwareLanguage> getById(int id);
}
