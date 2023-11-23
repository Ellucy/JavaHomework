package homeWorkPart2.task2;

public enum Genre {
    ACTION,
    DRAMA,
    COMEDY,
    SCIFI,
    HORROR;

    public String getFormattedName() {
        String name = this.name().toLowerCase();
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
}
