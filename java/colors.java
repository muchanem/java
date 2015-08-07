class colors {
  public static void main(String[] args) {
    String base03 = "\033[1;30m";
    String base02 = "\033[0;30m";
    String base01 = "\033[1;32m";
    String base00 = "\033[1;33m";
    String base0 = "\033[1;34m";
    String base1 = "\033[1;36";
    String base2 = "\033[0;37m";
    String base3 = "\033[1;37m";
    String yellow = "\033[0;33m";
    String orange = "\033[1;31m";
    String red = "\033[0;31m";
    String magenta = "\033[0;35m";
    String violet = "\033[1;35m";
    String blue = "\033[0;34m";
    String cyan = "\033[0;36m";
    String green = "\033[0;32m";
    String reset = "\033[0m";
    String clear = "\033[H\0332J";
    System.out.println(red+"Hello!");
  }
}
