package project.app.demo.message;

import org.springframework.stereotype.Repository;
import project.app.demo.conversation.conversationEntity;

import java.sql.Timestamp;

@Repository
public class messageEntity {
 private Integer id;
 private String text;
 private conversationEntity conversation;

 public Integer getId() {
  return id;
 }

 public String getText() {
  return text;
 }

 public conversationEntity getConversation() {
  return conversation;
 }

 public void setConversation(conversationEntity conversation) {
  this.conversation = conversation;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public void setText(String text) {
  this.text = text;
 }

}

