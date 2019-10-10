public class Message {

private int messageId;
private int parentId;
private String text;
/**
* Add getter and setter to get the parendId, messageID, and text
* A constructor is used to assign the messageID, parentID, and text for comparison.
*/
public Message(int messageId, int parentId, String text) {
this.messageId = messageId;
this.parentId = parentId;
this.text = text;
}
public int getMessageId() {
return messageId;
}
public void setMessageId(int messageId) {
this.messageId = messageId;
}
public int getParentId() {
return parentId;
}
public void setParentId(int parentId) {
this.parentId = parentId;
}
public String getText() {
return text;
}
public void setText(String text) {
this.text = text;
}
}

