(function(){
    'use strict';

    angular
        .module('movieflixapp')
        .controller('MovieDetailController', MovieDetailController);

    MovieDetailController.$inject = ['movieService','$routeParams'];
    function MovieDetailController(movieService, $routeParams){
        var movieDetailVm = this;

        init();

        function init(){
            console.log("Show parameters");
            console.log($routeParams);

            movieService.getMovieById($routeParams.id)
                .then(function(data){
                    console.dir(data);
                    movieDetailVm.movie = data;
                })
                .catch(function (error) {
                    console.log(error);
                })
        }

    }
})();