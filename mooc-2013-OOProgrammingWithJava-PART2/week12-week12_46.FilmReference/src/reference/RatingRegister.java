/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author kraczlam5898
 */
public class RatingRegister {

    private HashMap<Film, List<Rating>> ratedFilms;
    private HashMap<Person, HashMap<Film, Rating>> personalRating;

    public RatingRegister() {
        this.ratedFilms = new HashMap<Film, List<Rating>>();
        this.personalRating = new HashMap<Person, HashMap<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {
        if (!this.ratedFilms.containsKey(film)) {
            ArrayList<Rating> ratingsArr = new ArrayList<Rating>();
            ratingsArr.add(rating);
            this.ratedFilms.put(film, ratingsArr);
        } else {
            this.ratedFilms.get(film).add(rating);
        }

    }

    public List<Rating> getRatings(Film film) {
        if (ratedFilms.containsKey(film)) {
            return this.ratedFilms.get(film);
        }
        return null;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.ratedFilms;
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRating.containsKey(person)) {
            HashMap<Film, Rating> rateFilm = new HashMap<Film, Rating>();
            if (!rateFilm.containsKey(film)) {
                rateFilm.put(film, rating);
            }
            personalRating.put(person, rateFilm);
        } else {
            if (!personalRating.get(person).containsKey(film)) {
                personalRating.get(person).put(film, rating);
            }
        }
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film) {
        if (personalRating.get(person).containsKey(film)) {
            return personalRating.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {

        if (personalRating.keySet().contains(person)) {
            return personalRating.get(person);
        }
        
        HashMap<Film, Rating> newRating = new HashMap<Film, Rating>();
        return newRating;

    }

    public List<Person> reviewers() {
        Set<Person> ppl = personalRating.keySet();
        ArrayList<Person> pplArr = new ArrayList<Person>(ppl);
        return pplArr;
    }

}
