package kodlama.io.softwareLanguage.DataAccess.Concrete;


import kodlama.io.softwareLanguage.DataAccess.Abstract.SoftwareLanguageRepository;
import kodlama.io.softwareLanguage.Entities.Concrete.SoftwareLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //bu bir sınıfın dataAccess nesnesi oldugunu gosterir
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {
    List<SoftwareLanguage> softwareLanguages;

    public InMemorySoftwareLanguageRepository(){
        softwareLanguages = new ArrayList<SoftwareLanguage>();
        softwareLanguages.add(new SoftwareLanguage(1,"Python"));
        softwareLanguages.add(new SoftwareLanguage(2,"Java"));
        softwareLanguages.add(new SoftwareLanguage(3,"C#"));
    }
    @Override
    public List<SoftwareLanguage> addLanguage(int id, String name) {
        boolean hasDuplicate = false;

        for (SoftwareLanguage language : softwareLanguages) {
            if (language.getName().equals(name)) {
                hasDuplicate = true;
                break;
            }
        }
        if (!hasDuplicate && !name.equals("")) {
            softwareLanguages.add(new SoftwareLanguage(id, name));
        }

        return softwareLanguages;
    }

    @Override
    public List<SoftwareLanguage> delete(int id) {
        softwareLanguages.remove(id-1);
        return softwareLanguages;
    }

    @Override
    public List<SoftwareLanguage> addTechnology(int id,String name,String technology) {
        for(SoftwareLanguage softwareLanguage: softwareLanguages){
            if(softwareLanguage.getName().equals(name) && softwareLanguage.getId() == id){
                softwareLanguage.addTechnology(technology);
                break;
            }
        }
        return softwareLanguages;
    }


    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguages;
    }


    @Override
    public List<SoftwareLanguage> upgrade(int id, String name) {
        if(0<=id && id<= softwareLanguages.size()){
            softwareLanguages.remove(id-1);
            softwareLanguages.add(new SoftwareLanguage(id,name));
        }
        return softwareLanguages;
    }

    @Override
    public List<SoftwareLanguage> getById(int id) {
        List<SoftwareLanguage> idSoftwareLanguage = new ArrayList<>();
        if (id >= 0 && id < softwareLanguages.size()) {
            idSoftwareLanguage.add(softwareLanguages.get(id-1));
        }
        return idSoftwareLanguage;
    }

}
