package ucf.assignments;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.*;

class AppendTodoFileTest
{
    @Test
    void FileName()
    {
        //Assert that the name of the file is existent
    }

    @Test
    void initFile()
    {
        //Change name of file and assert that the name changed
    }

    @Test
    void returnFileDirec()
    {
        //Assert to make sure that there is a file path
        //Assert to check that the original file path and current file path are same
    }

    @Test
    void initFilePath()
    {
        //Change directory of file and assert that the path changed
    }

    @Test
    void loadFile()
    {
        //Use the file path to load a particular file
        //Assert to assure file is in memory
    }

    @Test
    void editFile()
    {
        //write to file based on value
        //Use try and catch to declare a value for the file
        //Assert to check if they match and delete file after
    }

    @Test
    void saveList()
    {
        //Save list to whatever name is entered in parameter
        //Assert to make sure that the file with the specific name is stored
    }
}