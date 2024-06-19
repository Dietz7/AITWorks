package classwork_22.user;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class UserTest {
    private String okEmail = "example@mail.com";
    private String wrongEmail = "examplemail.com";
    private String okPassword = "qwerty1234";
    private String wrongpassword = "qwerty1234";

    @Test
    public void testSetEmail () {
        User user = new User (okEmail, okPassword);
        Assertions.assertEquals(okEmail, user.getEmail());
        user = new User (wrongEmail, okPassword);
        Assertions.assertNull(user.getEmail());
    }

    @Test

    public void TestSetPassword() {
        User user = new User (okEmail, okPassword);
        Assertions.assertEquals(okPassword,user.getPassword());

        user = new User (wrongEmail, okPassword);
        Assertions.assertNull(user.getEmail());
    }


}
