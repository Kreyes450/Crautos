package CRAUTOS.controller;

import CRAUTOS.entity.Review;
import CRAUTOS.entity.Carro;
import CRAUTOS.service.IReviewService;
import CRAUTOS.service.ICarroService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReviewController {

    @Autowired
    private IReviewService reviewService;
    
    @Autowired
    private ICarroService carroService;

    @GetMapping("/reviews")
    public String index(Model model) {
        List<Review> listaReviews = reviewService.getAllReviews();
        model.addAttribute("titulo", "Tabla de Reviews");
        model.addAttribute("reviews", listaReviews);
        return "reviews";
    }

    @GetMapping("/crearReview")
    public String crearReview(Model model) {
        List<Carro> listaCarros = carroService.getAllCarros();
        model.addAttribute("review", new Review());
        model.addAttribute("carros", listaCarros);
        return "form-review";
    }

    @PostMapping("/guardarReview")
    public String guardarReview(@ModelAttribute Review review, BindingResult result, Model model) {
        if (review.getCarro() == null) {
            result.rejectValue("carro", "error.review", "Debe seleccionar un carro");
            List<Carro> listaCarros = carroService.getAllCarros();
            model.addAttribute("carros", listaCarros);
            return "form-review";
        }
        review.setCreatedAt(new Date());
        reviewService.saveReview(review);
        return "redirect:/reviews";
    }

     @GetMapping("/editarReview/{id}")
    public String editarReview(@PathVariable("id") Long idReview, Model model) {
        Review review = reviewService.getReviewById(idReview);
        model.addAttribute("review", review);
        return "editarReview";
    }

    @GetMapping("/eliminarReview/{id}")
    public String eliminarReview(@PathVariable("id") Long idReview) {
        reviewService.deleteReview(idReview);
        return "redirect:/reviews";
    }
}