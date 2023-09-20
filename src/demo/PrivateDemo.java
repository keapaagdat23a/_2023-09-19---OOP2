package demo;

public class PrivateDemo {
  String name;

  public static void main(String[] args) {
    new PrivateDemo().run();
  }

  public void run() {
    DontEverCreateMoreThanOneClassInASingleFile justDont = new DontEverCreateMoreThanOneClassInASingleFile();
    System.out.println(justDont);
    justDont.setName("Patrick");
    System.out.println(justDont);
    justDont.setName("");
    System.out.println(justDont);
  }
}

class DontEverCreateMoreThanOneClassInASingleFile {
  private String name;
  private int number;

  public void setName(String name) {
    if (! name.equals(""))
      this.name = name;
    else this.name = "[Unknown]";
  }

  @Override
  public String toString() {
    return "DontEverCreateMoreThanOneClassInASingleFile{" +
        "name='" + name + '\'' +
        ", number=" + number +
        '}';
  }
}
