package fis.java.finalproject.repository.mem;

import fis.java.finalproject.model.Detective;
import fis.java.finalproject.repository.IDetectiveRepository;

import java.util.*;

public class DetectiveMemRepository implements IDetectiveRepository {
    private Map<Long , Detective > detectiveMap= new HashMap<>();
    private static DetectiveMemRepository instance= new DetectiveMemRepository();
    public static DetectiveMemRepository getInstance(){
        return instance;
    }
    @Override
    public Detective insertOrUpdate(Detective detective) {
         detectiveMap.put(detective.getId(), detective);
         return  detective;
    }

    @Override
    public Detective findById(Long id) {
        Optional<Detective> opt= Optional.ofNullable(detectiveMap.get(id));
        if(opt.isPresent()) return (Detective) opt.get();
        else return null;
    }

    @Override
    public List<Detective> findAll() {
        return new ArrayList<>(detectiveMap.values());
    }

    @Override
    public void deleteById(Long id) {
        detectiveMap.remove(id);
    }
}
