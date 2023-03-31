package CRAUTOS.controller;

import CRAUTOS.entity.Review;
import CRAUTOS.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/review")
    public String showReviews(Model model) {
        model.addAttribute("review", reviewService.getAllReviews());
        return "review";
    }

    @GetMapping("/review/{id}")
    public String showReviewDetails(@PathVariable("id") Long id, Model model) {
        Review review = reviewService.getReviewById(id);
        model.addAttribute("review", review);
        return "review-details";
    }

    @GetMapping("/review/add")
    public String showAddReviewForm(Model model) {
        model.addAttribute("review", new Review());
        return "add-review-form";
    }

    @PostMapping("/review/add")
    public String addReview(Review review) {
        reviewService.saveReview(review);
        return "redirect:/review";
    }

}