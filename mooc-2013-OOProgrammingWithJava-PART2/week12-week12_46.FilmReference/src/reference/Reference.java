/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author kraczlam5898
 */
public class Reference {

    private RatingRegister register;

    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person person) {
        if (register.getPersonalRatings(person).isEmpty()) {
            Map<Film, List<Rating>> filmRatings = register.filmRatings();
            List<Film> films = new ArrayList<Film>();

            for (Film f : filmRatings.keySet()) {
                films.add(f);
            }

            Collections.sort(films, new FilmComparator(filmRatings));
            return films.get(0);
        }

        List<Person> reviewers = sortReviewersSimilaritiesTo(person);
        return getRecommandedFilm(person, reviewers);

    }

    public Map<Person, Integer> reviersSmilarities(Map<Film, Rating> filmRatings) {
        Map<Person, Integer> reviersSimilarities = new HashMap<Person, Integer>();

        for (Person p : register.reviewers()) {
            int similarities = 0;

            for (Film film : filmRatings.keySet()) {
                similarities += filmRatings.get(film).getValue() * register.getRating(p, film).getValue();
            }

            if (similarities > 0) {
                reviersSimilarities.put(p, similarities);

            }
        }
        return reviersSimilarities;

    }

    public List<Person> sortReviewersSimilaritiesTo(Person p) {
        Map<Person, Integer> reviersSimilarities = reviersSmilarities(register.getPersonalRatings(p));

        List<Person> similarReviers = new ArrayList<Person>(reviersSimilarities.keySet());
        Collections.sort(similarReviers, new PersonComparator(reviersSimilarities));
        return similarReviers;

    }

    public Film getRecommandedFilm(Person p, List<Person> otherViewers) {
        Map<Film, Rating> filmsSeenByPerson = register.getPersonalRatings(p);

        for (Person viewer : otherViewers) {
            if (viewer == p) {
                continue;
            }

            for(Film f: filmsSeenByPerson.keySet()){
                if(register.getPersonalRatings(viewer).containsKey(f)){
                    System.out.println("it does");
                    continue;
                }
//            for (Film f : register.getPersonalRatings(viewer).keySet()) {
//                if (filmsSeenByPerson.containsKey(f)) {
//                    continue;
//                }
                if (register.getRating(viewer, f).getValue() > 1) {
                    return f;
                }
            }

        }
        return null;
    }
}
