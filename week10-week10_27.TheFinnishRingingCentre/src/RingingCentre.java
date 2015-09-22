
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class RingingCentre {

    private final Map<Bird, List<String>> birds = new HashMap<Bird, List<String>>();

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (!birds.keySet().contains(bird)) {
            places.add(place);
            birds.put(bird, places);
        } else {
            places = birds.get(bird);
            places.add(place);
            birds.put(bird, places);
        }
    }

    public void observations(Bird bird) {
        if (birds.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
            //System.out.println(birds.get(bird));
        } else {
            System.out.println(bird.toString() + " observations: " + birds.get(bird).size());
            System.out.println(birds.get(bird));
        }
    }
}
