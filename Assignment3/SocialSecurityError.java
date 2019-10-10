

public class SocialSecurityError extends Exception{
//custom exception that display error if enter a wrong social security format
public SocialSecurityError() {
super("Invalid social security: Reason: Social Security Numbers must be in the format of DDD-DD-DDDD, where D is a digit");
}
}

