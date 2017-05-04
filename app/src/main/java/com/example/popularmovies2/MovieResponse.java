package com.example.popularmovies2;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class MovieResponse {
    /**
     * page : 1
     * results : [{"poster_path":"/tWqifoYuwLETmmasnGHO7xBjEtt.jpg","adult":false,"overview":"A live-action adaptation of Disney's version of the classic 'Beauty and the Beast' tale of a cursed prince and a beautiful young woman who helps him break the spell.","release_date":"2017-03-16","genre_ids":[14,10749],"id":321612,"original_title":"Beauty and the Beast","original_language":"en","title":"Beauty and the Beast","backdrop_path":"/6aUWe0GSl69wMTSWWexsorMIvwU.jpg","popularity":158.103128,"vote_count":1824,"video":false,"vote_average":6.9}]
     * total_results : 19536
     * total_pages : 977
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<Results> results;
    //Details
    /**
     * adult : false
     * backdrop_path : /6aUWe0GSl69wMTSWWexsorMIvwU.jpg
     * belongs_to_collection : null
     * budget : 160000000
     * genres : [{"id":14,"name":"Fantasy"},{"id":10749,"name":"Romance"}]
     * homepage : http://movies.disney.com/beauty-and-the-beast-2017
     * id : 321612
     * imdb_id : tt2771200
     * original_language : en
     * original_title : Beauty and the Beast
     * overview : A live-action adaptation of Disney's version of the classic 'Beauty and the Beast' tale of a cursed prince and a beautiful young woman who helps him break the spell.
     * popularity : 151.798438
     * poster_path : /tWqifoYuwLETmmasnGHO7xBjEtt.jpg
     * production_companies : [{"name":"Walt Disney Pictures","id":2},{"name":"Mandeville Films","id":10227}]
     * production_countries : [{"iso_3166_1":"GB","name":"United Kingdom"},{"iso_3166_1":"US","name":"United States of America"}]
     * release_date : 2017-03-16
     * revenue : 1048233200
     * runtime : 129
     * spoken_languages : [{"iso_639_1":"en","name":"English"}]
     * status : Released
     * tagline : Be our guest.
     * title : Beauty and the Beast
     * video : false
     * vote_average : 6.9
     * vote_count : 1898
     */
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("belongs_to_collection")
    private Object belongsToCollection;
    @SerializedName("budget")
    private int budget;
    @SerializedName("homepage")
    private String homepage;
    @SerializedName("id")
    private int id;
    @SerializedName("imdb_id")
    private String imdbId;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("overview")
    private String overview;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("release_date")
    private Date releaseDate;
    @SerializedName("revenue")
    private int revenue;
    @SerializedName("runtime")
    private int runtime;
    @SerializedName("status")
    private String status;
    @SerializedName("tagline")
    private String tagline;
    @SerializedName("title")
    private String title;
    @SerializedName("video")
    private boolean video;
    @SerializedName("vote_average")
    private double voteAverage;
    @SerializedName("vote_count")
    private int voteCount;
    @SerializedName("genres")
    private List<Genres> genres;
    @SerializedName("production_companies")
    private List<Genres> productionCompanies;
    @SerializedName("production_countries")
    private List<ProductionCountries> productionCountries;
    @SerializedName("spoken_languages")
    private List<SpokenLanguages> spokenLanguages;


    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public List<Results> getResults() {
        return results;
    }
    public void setResults(List<Results> results) {
        this.results = results;
    }
    //details
    public boolean isAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }
    public String getBackdropPath() {
        return backdropPath;
    }
    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }
    public Object getBelongsToCollection() {
        return belongsToCollection;
    }
    public void setBelongsToCollection(Object belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }
    public int getBudget() {
        return budget;
    }
    public void setBudget(int budget) {
        this.budget = budget;
    }
    public String getHomepage() {
        return homepage;
    }
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getImdbId() {
        return imdbId;
    }
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }
    public String getOriginalLanguage() {
        return originalLanguage;
    }
    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }
    public String getOriginalTitle() {
        return originalTitle;
    }
    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }
    public String getOverview() {
        return overview;
    }
    public void setOverview(String overview) {
        this.overview = overview;
    }
    public double getPopularity() {
        return popularity;
    }
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }
    public String getPosterPath() {
        return posterPath;
    }
    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }
    public Date getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public int getRevenue() {
        return revenue;
    }
    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
    public int getRuntime() {
        return runtime;
    }
    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTagline() {
        return tagline;
    }
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isVideo() {
        return video;
    }
    public void setVideo(boolean video) {
        this.video = video;
    }
    public double getVoteAverage() {
        return voteAverage;
    }
    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
    public int getVoteCount() {
        return voteCount;
    }
    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }
    public List<Genres> getGenres() {
        return genres;
    }
    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }
    public List<Genres> getProductionCompanies() {
        return productionCompanies;
    }
    public void setProductionCompanies(List<Genres> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }
    public List<ProductionCountries> getProductionCountries() {
        return productionCountries;
    }
    public void setProductionCountries(List<ProductionCountries> productionCountries) {
        this.productionCountries = productionCountries;
    }
    public List<SpokenLanguages> getSpokenLanguages() {
        return spokenLanguages;
    }
    public void setSpokenLanguages(List<SpokenLanguages> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public static class Results {
        /**
         * poster_path : /tWqifoYuwLETmmasnGHO7xBjEtt.jpg
         * adult : false
         * overview : A live-action adaptation of Disney's version of the classic 'Beauty and the Beast' tale of a cursed prince and a beautiful young woman who helps him break the spell.
         * release_date : 2017-03-16
         * genre_ids : [14,10749]
         * id : 321612
         * original_title : Beauty and the Beast
         * original_language : en
         * title : Beauty and the Beast
         * backdrop_path : /6aUWe0GSl69wMTSWWexsorMIvwU.jpg
         * popularity : 158.103128
         * vote_count : 1824
         * video : false
         * vote_average : 6.9
         */

        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("adult")
        private boolean adult;
        @SerializedName("overview")
        private String overview;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("id")
        private int id;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("title")
        private String title;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("video")
        private boolean video;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;

        public String getPosterPath() {
            return posterPath;
        }
        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }
        public boolean isAdult() {
            return adult;
        }
        public void setAdult(boolean adult) {
            this.adult = adult;
        }
        public String getOverview() {
            return overview;
        }
        public void setOverview(String overview) {
            this.overview = overview;
        }
        public String getReleaseDate() {
            return releaseDate;
        }
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getOriginalTitle() {
            return originalTitle;
        }
        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }
        public String getOriginalLanguage() {
            return originalLanguage;
        }
        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getBackdropPath() {
            return backdropPath;
        }
        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }
        public double getPopularity() {
            return popularity;
        }
        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }
        public int getVoteCount() {
            return voteCount;
        }
        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }
        public boolean isVideo() {
            return video;
        }
        public void setVideo(boolean video) {
            this.video = video;
        }
        public double getVoteAverage() {
            return voteAverage;
        }
        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }
        public List<Integer> getGenreIds() {
            return genreIds;
        }
        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }
    }

    public static class Genres {
        /**
         * id : 14
         * name : Fantasy
         */

        @SerializedName("id")
        private int id;
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ProductionCountries {
        /**
         * iso_3166_1 : GB
         * name : United Kingdom
         */

        @SerializedName("iso_3166_1")
        private String iso31661;
        @SerializedName("name")
        private String name;

        public String getIso31661() {
            return iso31661;
        }
        public void setIso31661(String iso31661) {
            this.iso31661 = iso31661;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static class SpokenLanguages {
        /**
         * iso_639_1 : en
         * name : English
         */

        @SerializedName("iso_639_1")
        private String iso6391;
        @SerializedName("name")
        private String name;

        public String getIso6391() {
            return iso6391;
        }
        public void setIso6391(String iso6391) {
            this.iso6391 = iso6391;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
