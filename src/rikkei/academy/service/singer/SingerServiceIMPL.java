package rikkei.academy.service.singer;

import rikkei.academy.model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService{
    public static List<Singer> singerList = new ArrayList<>();
    static {
        singerList.add(new Singer(1, "Huy", 4));
        singerList.add(new Singer(2, "Chính Gà", 39));
        singerList.add(new Singer(2, "Chính Gà", 5));
        singerList.add(new Singer(3, "Nam Nấm", 6));
    }
    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer singer) {
        singerList.add(singer);
    }

    @Override
    public Singer findByID(int id) {
        for (int i = 0; i < singerList.size(); i++) {
            if(id==singerList.get(i).getId()){
                return singerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < singerList.size(); i++) {
            if(id==singerList.get(i).getId()){
                singerList.remove(i);
            }
        }
    }

    @Override
    public List<Singer> sortByNameAndByAge() {
        List<Singer> listSort = new ArrayList<>();
        for (int i = 0; i < singerList.size(); i++) {
            listSort.add(singerList.get(i));
        }
        Collections.sort(listSort);
        return listSort;
    }
}
