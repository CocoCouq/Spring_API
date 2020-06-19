package com.api.start.web.controller;
import com.api.start.model.Score;
import com.api.start.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * <p>ScoreController class.</p>
 *
 * @see com.api.start.StartApplication
 * Controller for Score Entity
 * Contain all path for API REST response (JSON)
 * @see ScoreRepository
 * Find model :
 * @see Score
 * @author Corentin COUQ
 *
 * Find repository :
 * @version $Id: $Id
 */
@RestController
public class ScoreController {

    @Autowired
    private ScoreRepository scoreRepository;

    /**
     * Get List of scores
     *
     * @return List of scores
     */
    @RequestMapping(value = "/Scores", method = RequestMethod.GET)
    public @ResponseBody List<Score> listScores() {
        return (List<Score>) scoreRepository.findAll();
    }

    /**
     * Add new score
     *
     * @param score The new Score
     * @return The new Score
     */
    @RequestMapping(value = "/Scores", method = RequestMethod.POST)
    public Score addScore(@RequestBody Score score) {
        // If already exist, return empty Score
        if (!scoreRepository.findById(score.getId()).isPresent())
            return scoreRepository.save(score);
        else
            return new Score(0, "", 0);
    }

    /**
     * Get one score by id value
     *
     * @param id Score id
     * @return The Score
     */
    @RequestMapping(value = "Scores/{id}", method = RequestMethod.GET)
    public Optional<Score> getById(@PathVariable int id) {
        return scoreRepository.findById(id);
    }

    /**
     * Delete one score
     *
     * @param score Score to delete
     * @return The old score id
     */
    @RequestMapping(value = "/Scores/delete", method = RequestMethod.POST)
    public int deleteById(@RequestBody Score score) {
        int id = score.getId();
        scoreRepository.deleteById(id);
        return id;
    }

    /**
     * Update one score
     *
     * @param score The old score
     * @return The new score
     */
    @RequestMapping(value = "/Scores/Update", method = RequestMethod.POST)
    public Score updateScore(@RequestBody Score score) {
        // If not exist, return empty Score
        if (scoreRepository.findById(score.getId()).isPresent())
            return scoreRepository.save(score);
        else
            return new Score(0, "", 0);
    }
}
