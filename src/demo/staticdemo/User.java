package demo.staticdemo;

public class User {
  private static int nextId = 1000;
  private int id = 1;
  private String name;

  public User(String name) {
    assignId();
    this.name = name;
  }

  public User() {
    assignId();
    this.name = "[Unknown]";
  }

  private void assignId() {
    id = nextId++;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
