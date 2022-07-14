/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package coretam;
import java.sql.Date;
/**
 *
 * @author Lucky
 */



public class coretan {
    public class Resource {
        private String title;
        private Boolean borrowed_status;
        private String date_borrowed;
        private String due_date;

        public String getTitle(){
            return "";
        }
        public void setTitle(String resourceTitle){

        }
        public Boolean getBorrowedStatus(){
            return true;
        }
        public void setBorrowedStatus(Boolean status){

        }
        public String getDateBorrowed(){
            return "";
        }
        public void setDateBorrowed(String date){

        }
        public void setDueDate(Date borrowedDate){

        }
    }

    public class Encyclopedia extends Resource{
        private int Volume;
        private int Edition;

        public void getVolume(){

        }

        public void setVolume(int volumeNum){

        }

        public int getEdition(){
            return 0;
        }

        public void setEdition(int editionNum){

        }
    }
}
