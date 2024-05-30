public abstract class Sweet implements Baked {
    private String name;

    public Sweet(java.lang.String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Sweet{" +
                "name:" + name +
                '}';
    }
}
