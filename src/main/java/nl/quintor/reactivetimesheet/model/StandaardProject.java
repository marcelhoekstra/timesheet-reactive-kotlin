package nl.quintor.reactivetimesheet.model;

/**
 * Deze enum bevat een aantal standaard projecten, zoals verlof.
 *
 * @author Guido van der Zanden ($$Author: mhoekstra $$)
 * @version $$Revision: 254 $$ $$Date: 2015-01-15 19:41:45 +0100 (Thu, 15 Jan 2015) $$
 *          ${tags}
 */
public enum StandaardProject {

    PROJECT_VERLOF("verlof"), PROJECT_PARTIME("partime dag");

    /* Naam van het project. */
    private String naam;

    StandaardProject(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
}
