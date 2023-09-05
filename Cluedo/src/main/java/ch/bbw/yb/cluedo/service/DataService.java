package ch.bbw.yb.cluedo.service;

import ch.bbw.yb.cluedo.model.Colors;
import ch.bbw.yb.cluedo.model.Person;
import ch.bbw.yb.cluedo.model.Room;
import ch.bbw.yb.cluedo.model.Weapon;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.awt.*;
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
                        new Weapon("Dolch", "Stahl", "25cm", "450g"),
                        new Weapon("Kerzenständer", "Eisen", "30cm", "1kg"),
                        new Weapon("Bleirohr", "Blei", "50cm", "2.5kg"),
                        new Weapon("Seil", "Hanf", "2.5m", "600g"),
                        new Weapon("Rohrzange", "Eisen", "30cm", "1kg"),
                        new Weapon("Revolver", "Stahl/Kunststoff", "25cm", "400g")
                ));

        rooms = new ArrayList<>(
                Arrays.asList(
                        new Room("Saal", "50cm²", Colors.RED, "Tisch"),
                        new Room("Lounge", "25cm²", Colors.BLUE, "Sofas, Teppich"),
                        new Room("Esszimmer", "20cm²", Colors.BROWN, "Esstisch, Schrank"),
                        new Room("Küche", "15cm²", Colors.WHITE, "Schränke"),
                        new Room("Ballraum", "75cm²", Colors.RED, "Sofa, Klavier"),
                        new Room("Vorratsraum", "10cm²", Colors.RED, "Pflanzen, Boxen"),
                        new Room("Billardraum", "25cm²", Colors.GREEN, "Billardtisch"),
                        new Room("Bibliothek", "35cm²", Colors.BROWN, "Büchergestell"),
                        new Room("Lernraum", "20cm²", Colors.RED, "Pult")
                ));
    }

}
