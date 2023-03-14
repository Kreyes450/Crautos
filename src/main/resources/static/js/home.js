$('#carouselExampleCaptions').on('slide.bs.carousel', function () {
    $(this).find('.active').removeClass('active');
});
