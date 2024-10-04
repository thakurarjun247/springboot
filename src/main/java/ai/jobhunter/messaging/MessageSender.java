package ai.jobhunter.messaging;

public interface MessageSender<T> {

    void sendMessage(T message);
}