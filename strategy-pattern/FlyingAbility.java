public interface FlyingAbility {
  String getFlyingAbility();
}

class CanFlys implements FlyingAbility {
  public String getFlyingAbility() {
    return "Can fly";
  }
}

class CannotFlys implements FlyingAbility {
  public String getFlyingAbility() {
    return "Cannot fly";
  }
}
