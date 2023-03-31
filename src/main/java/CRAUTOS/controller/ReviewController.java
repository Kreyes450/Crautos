package CRAUTOS.controller;

import CRAUTOS.entity.Review;
import CRAUTOS.service.IReviewService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class ReviewController {

    @Autowired
    private IReviewService reviewService;

    @GetMapping("/review")
    public String getAllReviews(Model model) {
        List<Review> reviews = reviewService.getAllReviews();
        model.addAttribute("review", reviews);
        return "review";
    }

    @GetMapping("/review/{id}")
    public String getReviewById(@PathVariable("id") long id, Model model) {
        Review review = reviewService.getReviewById(id);
        model.addAttribute("review", review);
        return "review";
    }

    @GetMapping("/review/new")
    public String showReviewForm(Model model) {
        Review review = new Review();
        model.addAttribute("review", review);
        return "review-form";
    }

    @PostMapping("/review")
    public String saveReview(@ModelAttribute("review") Review review) {
        reviewService.saveReview(review);
        return "redirect:/review";
    }

    @GetMapping("/review/edit/{id}")
    public String showEditForm(@PathVariable("id") long id, Model model) {
        Review review = reviewService.getReviewById(id);
        model.addAttribute("review", review);
        return "review-form";
    }

    @PostMapping("/review/update/{id}")
    public String updateReview(@PathVariable("id") long id, @ModelAttribute("review") Review review) {
        reviewService.saveReview(review);
        return "redirect:/review";
    }

    @GetMapping("/review/delete/{id}")
    public String deleteReview(@PathVariable("id") long id) {
        reviewService.deleteReview(id);
        return "redirect:/review";
    }
}
