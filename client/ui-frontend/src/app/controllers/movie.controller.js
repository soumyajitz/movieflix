(function(){
    'use strict';

    angular
        .module('movieflixapp')
        .controller('MovieController', MovieController);

    MovieController.$inject = ['movieService'];
    function MovieController(movieService){
        var movieVm = this;

        movieVm.sorter = {
            by: 'Title',
            reverse: false
        };

        movieVm.toggleSort = toggleSort;
        init();

        function init(){
            console.log("Show Movies from Movie Controller");

            movieService.getAllMovies()
                .then(function(data){
                    console.dir(data);
                    movieVm.movie = data;
                })
                .catch(function (error) {
                    console.log(error);
                })
        }

        function toggleSort(prop) {
            console.log(prop);
            movieVm.sorter.by = prop;
            movieVm.sorter.reverse = !movieVm.sorter.reverse;
        }
    }
})();