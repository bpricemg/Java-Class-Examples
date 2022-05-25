class Movie {
    /** Data fields */
    double musicRating;
    double scriptRating;
    double actorRating;

    /** Constructors */
    Movie() {
        musicRating = scriptRating = actorRating = 0;
    }

    Movie(double music, double script, double actor) {
        musicRating = music;
        scriptRating = script;
        actorRating = actor;
    }

    /** Instance methods */
    double overallRating() {
        return (musicRating + scriptRating + actorRating) / 3;
    }

    void updateMusic(double updated_value) {
        musicRating = updated_value;
    }

    void updateScript(double updated_value) {
        scriptRating = updated_value;
    }
    
    void updateActor(double updated_value) {
        actorRating = updated_value;
    }
}