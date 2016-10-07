(function(){
    'use strict';

    angular
        .module('movieflixapp')
        .service('adminService', adminService);

    adminService.$inject = ['$http', '$q', 'CONFIG'];
    function adminService($http, $q, CONFIG){
        var self = this;

        self.addMovie = addMovie;
        self.viewMovies = viewMovies;
        self.getMovieById = getMovieById;
        self.updateMovies = updateMovies;
        self.deleteMovies = deleteMovies;

        function viewMovies(){
            return $http.get(CONFIG.API_HOST + "/movie")
                .then(successFn, errorFn);
        }

        function getMovieById(id){
            return $http.get(CONFIG.API_HOST + '/movie/' + id)
                .then(successFn, errorFn);
        }

        function updateMovies(id,movie){
            console.log('Updating Movies');
            return $http.put(CONFIG.API_HOST + "/movie/admin/"+id,movie)
        }

        function deleteMovies(id){
            console.log('Deleting Movies');
            return $http.delete(CONFIG.API_HOST + "/movie/admin/"+id)
        }

        function addMovie(movie){
            return $http.post(CONFIG.API_HOST + "/movie/admin",movie)
                .then(successFn, errorFn);
        }

        function successFn(response) {
            return response.data;
        }

        function errorFn(response) {
            return $q.reject(error.status);
        }
    }

})();