/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRAUTOS.service;


import CRAUTOS.entity.Review;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
/**
 *
 * @author reyes
 */


public interface IReviewService {

    public List<Review> getAllReview();

    public Review getReviewById(long id);

    public void saveReview(Review review);

    public void deleteReview(long id);

    public List<Review> getAllReviews();
}
