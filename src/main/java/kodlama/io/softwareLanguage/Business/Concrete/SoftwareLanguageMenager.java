package kodlama.io.softwareLanguage.Business.Concrete;

import kodlama.io.softwareLanguage.Business.Abstract.SoftwareLanguageService;
import kodlama.io.softwareLanguage.DataAccess.Abstract.SoftwareLanguageRepository;
import kodlama.io.softwareLanguage.Entities.Concrete.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguageMenager implements SoftwareLanguageService {
    private SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageMenager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> addLanguage(int id, String name) {
        return softwareLanguageRepository.addLanguage(id,name);
    }

    @Override
    public List<SoftwareLanguage> addTechnology(int id,String name,String subLanguage) {
        return softwareLanguageRepository.addTechnology(id,name,subLanguage);
    }

    @Override
    public List<SoftwareLanguage> delete(int id) {
        return softwareLanguageRepository.delete(id);
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return softwareLanguageRepository.getAll();
    }

    @Override
    public List<SoftwareLanguage> getById(int id) {
        return softwareLanguageRepository.getById(id);
    }

    @Override
    public List<SoftwareLanguage> upgrade(int id,String name) {
        return softwareLanguageRepository.upgrade(id,name);
    }
}
