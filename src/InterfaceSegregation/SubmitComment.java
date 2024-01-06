package InterfaceSegregation;

public interface SubmitComment {
    void submitComment();
    // интерфейс реализуют только два класса, гость и обычный пользователь
    // клиенты не должны быть вынуждены реализовывать методы которые не будут использовать имеется ввиду админов

}
