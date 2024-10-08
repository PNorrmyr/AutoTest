package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserServiceTest {

    @Test
    void testGetUserNameById(){
        //Given
        UserDao userDao = mock(UserDao.class);
        User expectedUser = new User(1, "Philip");
        when(userDao.findById(1)).thenReturn(expectedUser);
        UserService userService = new UserService(userDao);

        //When
        String name = userService.getUserNameById(1);


        //Then
        assertEquals("Philip", name);


    }

}