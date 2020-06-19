package com.api.start.model;

import javax.persistence.*;

/**
 * <p>Score class.</p>
 *
 * @see com.api.start.StartApplication
 * Score Entity to define table value
 * @see com.api.start.web.controller.ScoreController
 * Find repository :
 * @see com.api.start.repository.ScoreRepository
 * @author Corentin COUQ
 *
 * Find methods :
 * @version $Id: $Id
 */
@Entity
@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private int score;

    /**
     * Default constructor
     */
    public Score() {
    }

    /**
     * Constructor with params
     *
     * @param id Primary key
     * @param name Score name (player)
     * @param score Score result
     */
    public Score(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // GETTERS AND SETTERS + toString()
    /**
     * <p>Getter for the field <code>id</code>.</p>
     *
     * @return a int.
     */
    public int getId() {
        return id;
    }

    /**
     * <p>Setter for the field <code>id</code>.</p>
     *
     * @param id a int.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <p>Getter for the field <code>name</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getName() {
        return name;
    }

    /**
     * <p>Setter for the field <code>name</code>.</p>
     *
     * @param name a {@link java.lang.String} object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>Getter for the field <code>score</code>.</p>
     *
     * @return a int.
     */
    public int getScore() {
        return score;
    }

    /**
     * <p>Setter for the field <code>score</code>.</p>
     *
     * @param score a int.
     */
    public void setScore(int score) {
        this.score = score;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
