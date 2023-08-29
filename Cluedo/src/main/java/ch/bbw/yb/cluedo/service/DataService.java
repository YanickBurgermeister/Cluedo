package ch.bbw.yb.cluedo.service;

import ch.bbw.yb.cluedo.model.Person;
import ch.bbw.yb.cluedo.model.Room;
import ch.bbw.yb.cluedo.model.Weapon;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class DataService {

    private List<Person> persons;
    private List<Room> rooms;
    private List<Weapon> weapons;

    public DataService() {
        persons = new ArrayList<>(
                Arrays.asList(
                        new Person("Colonel", "Mustard", 65, 1.80),
                        new Person("Professor", "Plum", 70, 1.70),
                        new Person("Miss", "Scarlett", 32, 1.65),
                        new Person("Reverend", "Green", 50, 1.85),
                        new Person("Mrs", "White", 55, 1.60),
                        new Person("Mrs", "Peacock", 67, 1.70)
                ));

        weapons = new ArrayList<>(
                Arrays.asList(
                        new Weapon("", "", "", "")
                ));

        rooms = new ArrayList<>(
                Arrays.asList(
                        new Room("", "", ENUM, "")
                ));
    }

}
