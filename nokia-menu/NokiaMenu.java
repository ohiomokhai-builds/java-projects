
//Display a Nokia 5510 Menu from 1-15
//Get number from user through a prompt
//Display choice number menu successful entry
//Display inside menus from choice parent menu when applicable
//Get number from user through prompt
//Display choice inside menu successful entry
//Display invalid output if the required number is not is gotten matched

import java.util.Scanner;

public class NokiaMenu {

	public static void main (String... args) {

	Scanner input = new Scanner (System.in);

	String parentMenu = """	
	========== Welcome to the Nokia 5510 Menu =========
	
			  1. Phone book
			  2. Messages
			  3. Chat
			  4. Call register
			  5. Tones
			  6. Settings
			  7. Call divert
			  8. Music
			  9. Games
			  10. Calculator
			  11. Reminders
			  12. Clock
			  13. Profiles
			  14. Services
			  15. SIM service
			        
  ================== ************ ==================== 
	
			            """;
			            
  System.out.print(parentMenu);
  System.out.println("Enter any choice menu number: ");
  String numberMenu = input.nextLine(); 
  
   switch (numberMenu) {
   
          case "1" -> {
          
          String phoneMenu = """           
          ===== Welcome to Phone Book menu ====
          
          1. Search
          2. Service Nos.1
          3. Add name
          4. Erase
          5. Edit
          6. Copy
          7. Assign tone
          8. Send b’card
          9. Options
          10. Speed dials
          11. Voice tags
          
          ======================================
          
          """;          
          System.out.print(phoneMenu);
          System.out.println("Enter a choice number in the menu: ");
          String firstMenu = input.nextLine();

          switch (firstMenu) {
                  case "1" -> {
                  System.out.println("Entering Search feature...");
                  }
                  case "2" -> {
                  System.out.println("Entering Service_Nos.1 function...");
                  }
                  case "3" -> {
                  System.out.println("Entering Add name function...");
                  }  
                  case "4" -> {
                  System.out.println("Entering Erase function...");
                  }  
                  case "5" -> {
                  System.out.println("Entering Edit function...");
                  }  
                  case "6" -> {
                  System.out.println("Entering Copy function...");
                  }  
                  case "7" -> {
                  System.out.println("Entering Assign tone function...");
                  }
                  case "8" -> {
                  System.out.println("Entering Send b'card function...");
                  }
                  case "9" -> {
                    String option = """           
                    ===== Options Menu ====
                    
                    1. Memory in use
                    2. Type of view
                    3. Memory status
                    
                    ========================    
                    """;
                    System.out.print(option);
                    System.out.println("Enter a choice number in this menu : ");
                    String optionMenu = input.nextLine();
                    
                     switch (optionMenu) {
                        case "1" -> {
                        System.out.println("Entering Memory in use feature...");
                        System.out.println("<- To exit press 0");
                        }
                        case "2" -> {
                        System.out.println("Entering Type of view feature...");
                        System.out.println("<- To exit press 0"); 
                        }
                        case "3" -> {
                        System.out.println("Entering Memory status feature...");
                        System.out.println("<- To exit press 0");
                        }
                        case "0" -> {
                          System.out.println("Returning to the parent menu...");
                        }
                        default -> {
                          System.out.println("Invalid choice. Please choose correctly!!");
                        }
                    }
                  }
                  case "10" -> {
                  System.out.println("Entering Speed dials function...");
                  }
                  case "11" -> {
                  System.out.println("Entering Voice tags function...");
                  }
                  case "0" -> {
                  System.out.println("Returning to the parent menu... ");
                  }
                  default -> {
                  System.out.println("Invalid choice. Please, Try again!!");                 
                  }                              
              }          
          }
          
          case "2" -> {
           String messageMenu = """ 
          ===== Message menu ====
          
          1. Write messages
          2. Inbox
          3. Outbox
          4. Picture messages
          5. Templates
          6. Smileys
          7. Message settings
          8. Info service
          9. Voice mailbox number
          10. Service command editor
          
          ======================================
          """;
          System.out.print(messageMenu);
          System.out.println("Enter a choice number in the menu: ");
          String secondMenu = input.nextLine(); 
          
          switch (secondMenu) {
                case "1" -> {
                 System.out.println("Entering Message feature...");
                 }
                case "2" -> {
                 System.out.println("Entering Inbox feature...");
                 }
                case "3" -> {
                 System.out.println("Entering Outbox feature...");
                 }
                case "4" -> {
                 System.out.println("Entering Picture messages feature...");
                 } 
                case "5" -> {
                 System.out.println("Entering Template feature...");
                 }
                case "6" -> {
                 System.out.println("Entering Smileys feature...");
                 }
                case "7" -> {
                    String messageSettings= """     
                    ===== Message Settings Menu ====
                    
                    1. Set1
                    2. Common
                    
                    =================================
                    
                    """;
                    System.out.print(messageSettings);
                    System.out.println("Enter a choice number in the menu: ");
                    String menu7 = input.nextLine();
                    
                    switch (menu7) {
                      case "1" -> {
                       String set1= """ 
                    ===== Set1 Menu ========
                
                    1. Message center number
                    2. Messages sent as
                    3. Message validity
                    
                    ========================
                    """;
                    System.out.print(set1);
                    System.out.println("Enter a choice number in the menu: ");
                    String menuSet = input.nextLine();
                      
                      switch (menuSet) {
                        case "1" -> {
                          System.out.println("Entering Message center number feature...");
                        }
                        case "2" -> {
                          System.out.println("Entering Messages sent as feature...");
                        }
                        case "3"-> {
                          System.out.println("Entering Message validity... ");
                        }
                        case "0" -> {
                          System.out.println("Returning to the parent menu...");
                        }
                        default -> {
                          System.out.println("Invalid choice. Please choose correctly!!");
                        }
                      }
                    }
                      case "2"-> {
                           String common = """ 
                      ===== Common Menu ====
                      
                        1. Delivery reports
                        2. Reply via same centre
                        3. Character support
                      
                      ======================
                      """;
                      System.out.print(common);
                      System.out.println("Enter a choice number in the menu: ");
                      String commonMenu = input.nextLine();
                     
                      switch (commonMenu) {
                        case "1" -> {
                          System.out.println("Entering Delivery reports feature...");
                        }
                        case "2" -> {
                          System.out.println("Entering Reply via same centre feature...");
                        }
                        case "3"-> {
                          System.out.println("Entering Character support feature... ");
                        }
                        case "0" -> {
                          System.out.println("Returning to the parent menu...");
                        }
                        default -> {
                          System.out.println("Invalid choice. Please choose correctly!!");
                        }
                      }
                    }
                  } 
                }
                case "8" -> {
                 System.out.println("Entering Info service feature...");
                 }
                case "9" -> {
                 System.out.println("Entering Voice mailbox number feature...");
                 }
                case "10" -> {
                 System.out.println("Service commander editor feature...");
                 }
                case "0" -> {
                System.out.println("Returning to the parent menu...");
                }
                default -> {
                System.out.println("Invalid choice. Please choose correctly!!");
                }
              } 
          }
          
          case "3" -> {
          System.out.println("Entering Chat feature...");
          }
          
          case "4" -> {
              String callRegister = """
              ===== Call Register Menu ====
              
              1. Missed calls
              2. Received calls
              3. Dialed numbers
              4. Erase recent call lists
              5. Show call duration
              6. Show call costs
              7. Call cost settings
              8. Prepaid credit
              
              ===============================
              """;
              System.out.print(callRegister);
              System.out.println("Enter a choice number in the menu: ");
              String callRegisterMenu = input.nextLine(); 
              
                switch (callRegisterMenu) {
                  case "1" -> {
                    System.out.println("Entering Missed calls feature...");
                  }
                  case "2" -> {
                    System.out.println("Entering Received calls feature...");
                  }
                  case "3" -> {
                    System.out.println("Entering Dialed calls feature...");
                  }
                  case "4" -> {
                    System.out.println("Entering Show call costs feature...");
                  }
                  case "5" -> {
                    String callDuration = """              
                    ===== Show Costs Menu ====
                    
                        1. Last call duration
                        2. All calls’ duration
                        3. Received calls’ duration
                        4. Dialed calls’ duration
                        5. Clear timers
                        
                    ===========================
                    """;
                    System.out.print(callDuration);
                    System.out.println("Enter a choice number in the menu: ");
                    String callDurationMenu = input.nextLine(); 
                    
                      switch (callDurationMenu) {
                        case "1" -> {
                          System.out.println("Entering Last call duration feature...");                          
                        }
                        case "2" -> {
                          System.out.println("Entering All calls’ duration feature...");
                        }
                        case "3" -> {
                            System.out.println("Entering Received calls’ duration feature...");
                        }
                        case "4" -> {
                            System.out.println("Entering Dialed calls duration feature...");
                        }
                        case "5" -> {
                            System.out.println("Entering Clear timers duration feature...");
                        }
                        case "0" -> {
                        System.out.println("Returning to the parent menu...");
                        }
                        default -> {
                        System.out.println("Invalid choice. Please, choose correctly!!");
                        }
                      }
                    }                   
                  case "6" -> {
                    String showCosts = """
                    ===== Show Costs Menu ====
                    
                        1. Last call cost
                        2. All calls’ cost
                        3. Clear counters
                    
                    ===============================

                    """;
                    System.out.print(showCosts);
                    System.out.println("Enter a choice number in the menu: ");
                    String showCostsMenu = input.nextLine(); 
                    
                      switch (showCostsMenu) {
                        case "1" -> {
                          System.out.println("Entering Last call cost feature...");                          
                        }
                        case "2" -> {
                          System.out.println("Entering All call cost feature...");
                        }
                        case "3" -> {
                            System.out.println("Entering Clear counters feature...");
                        }
                        case "0" -> {
                        System.out.println("Returning to the parent menu...");
                        }
                        default -> {
                        System.out.println("Invalid choice. Please, choose correctly!!");
                        }
                      }
                    }
                  case "7" -> {
                    String callCost = """
                    ===== Call cost settings ====
                    
                        1. Call cost limit
                        2. Show costs in
                       
                    ===============================
                    """;
                    System.out.print(callCost);
                    System.out.println("Enter a choice number in the menu: ");
                    String callCostMenu = input.nextLine();
                    
                        switch (callCostMenu) {
                            case "1" -> {
                              System.out.println("Entering Last Call cost limit feature..."); 
                            }
                            case "2" -> {
                              System.out.println("Entering Show costs in feature..."); 
                            }
                            case "0" -> {
                              System.out.println("Returning to the parent menu...");
                            }
                            default -> {
                              System.out.println("Invalid choice. Please, choose correctly!!");
                            }
                          }
                        }
                  case "8" -> {
                    System.out.println("Entering Prepaid credit feature...");
                  }
                  case "0" -> {
                    System.out.println("Returning to the parent menu...");
                  }
                  default -> {
                    System.out.println("Invalid choice. Please choose correctly!!");
                  }
                }
              }
                
                case "5" -> {
                
                String tones = """
                  ===== Tones Menu ===========
                  
                  1. Ringing tone
                  2. Ringing volume
                  3. Incoming call alert
                  4. Message alert tone
                  5. Keypad tones
                  6. Warning tones
                  7. Vibrating alert
                  8. Screen saver
                  
                  =============================
                  """;
                  System.out.print(tones);
                  System.out.println("Enter a choice number in the menu: ");
                  String tonesMenu = input.nextLine(); 
                  
                    switch (tonesMenu) {
                      case "1" -> {
                        System.out.println("Entering Ringing tone feature...");
                      }
                      case "2" -> {
                        System.out.println("Entering Ringing volume feature...");
                      }
                      case "3" -> {
                        System.out.println("Entering Incoming call alert feature...");
                      }
                      case "4" -> {
                        System.out.println("Entering Message alert tone feature...");
                      }
                      case "5" -> {
                        System.out.println("Entering Keypad tones feature...");
                      }
                      case "6" -> {
                        System.out.println("Entering Warning tones feature...");
                      }
                      case "7" -> {
                        System.out.println("Entering Vibrating alert feature...");
                      }
                      case "8" -> {
                        System.out.println("Entering Screen saver feature...");
                      }
                      case "0" -> {
                        System.out.println("Returning to the parent menu...");
                      }
                      default -> {
                        System.out.println("Invalid choice. Please choose correctly!!");
                      }
                    }
                  }
                    
                case "6" -> {
                
                String settings = """
                  ===== Settings Menu ====
                  
                  1. Call settings
                  2. Phone settings
                  3. Security level
                  4. Restore factory settings
                
                  ===============================
                  """;
                  System.out.print(settings);
                  System.out.println("Enter a choice number in the menu: ");
                  String settingsMenu = input.nextLine(); 
                  
                    switch (settingsMenu) {
                      case "1" -> {
                          String callSettings = """
                        ===== Call Settings Menu =====
                        
                        1. Automatic redial
                        2. Speed dialing
                        3. Call waiting options
                        4. Own number sending
                        5. Phone line in use
                        6. Automatic answer
                      
                        ===============================
                        """;
                        System.out.print(callSettings);
                        System.out.println("Enter a choice number in the menu: ");
                        String callSettingsMenu = input.nextLine();
                        
                        switch (callSettingsMenu) {
                          case "1" -> {
                            System.out.println("Entering Automatic redial feature...");
                          } 
                          case "2" -> {
                            System.out.println("Entering Speed dialing feature...");
                          }
                          case "3" -> {
                            System.out.println("Entering Call waiting options feature...");
                          }
                          case "4" -> {
                            System.out.println("Entering Own number sending feature...");
                          }
                          case "5" -> {
                            System.out.println("Entering Phone line in use feature...");
                          }
                          case "6" -> {
                            System.out.println("Entering Automatic answer feature...");
                          }
                          case "0" -> {
                              System.out.println("Returning to the parent menu...");
                          }
                          default -> {
                              System.out.println("Invalid choice. Please, choose correctly!!");
                          }
                        }
                      }                             
                      case "2" -> {
                         String phoneSettings = """
                        ===== Phone Settings Menu ====
                        
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Confirm SIM service actions
                                              
                        ==============================
                        """;
                        System.out.print(phoneSettings);
                        System.out.println("Enter a choice number in the menu: ");
                        String phoneSettingsMenu = input.nextLine();
                        
                        switch (phoneSettingsMenu) {
                          case "1" -> {
                            System.out.println("Entering Language feature...");
                          }
                          case "2" -> {
                            System.out.println("Entering Cell info display feature...");
                          }
                          case "3" -> {
                            System.out.println("Entering Welcome note feature...");
                          }
                          case "4" -> {
                            System.out.println("Entering Network selection feature...");
                          }
                          case "5" -> {
                            System.out.println("Entering Confirm SIM service actions feature...");
                          }
                          case "0" -> {
                              System.out.println("Returning to the parent menu...");
                          }
                          default -> {
                              System.out.println("Invalid choice. Please, choose correctly!!");
                          }
                        }
                      }
                      case "3" -> {
                        String securitySettings = """
                        ===== Security Settings Menu ====
                        
                          1. PIN code request
                          2. Call barring service
                          3. Fixed dialing
                          4. Closed user group
                          5. Security level
                          6. Change access codes
                          
                        =================================
                        """;
                        System.out.print(securitySettings);
                        System.out.println("Enter a choice number in the menu: ");
                        String securitySettingsMenu = input.nextLine();
                        
                        switch (securitySettingsMenu) {
                          case "1" -> {
                            System.out.println("Entering PIN code request feature...");
                          }
                          case "2" -> {
                            System.out.println("Entering Call barring service feature...");
                          }
                          case "3" -> {
                            System.out.println("Entering Fixed dialing feature...");
                          }
                          case "4" -> {
                            System.out.println("Entering Closed user group feature...");
                          }
                          case "5" -> {
                            System.out.println("Entering Security level feature...");
                          }
                          case "6" -> {
                            System.out.println("Entering Change access codes feature...");
                          }
                          case "0" -> {
                              System.out.println("Returning to the parent menu...");
                          }
                          default -> {
                              System.out.println("Invalid choice. Please, choose correctly!!");
                          }
                        }
                      }
                      case "4" -> {
                        System.out.println("Entering Restore factory settings feature...");
                      }
                      case "0" -> {
                        System.out.println("Returning to the parent menu...");
                      }
                      default -> {
                        System.out.println("Invalid choice. Please choose correctly!!");
                      }
                    }             
                  }
                
              case "7" -> {
          
                  System.out.println("Entering Call divert feature...");
                }
                  
              case "8" -> {
          
                  String music = """
                  ===== Music Menu ====
                  
                    1. Music player
                    2. Radio
                    3. Recorder
                    4. Track list
                  
                  ===============================
                  """;
                  System.out.print(music);
                  System.out.println("Enter a choice number in the menu: ");
                  String musicMenu = input.nextLine(); 
                  
                    switch (musicMenu) {
                      case "1" -> {
                        System.out.println("Entering Music player feature...");
                      }
                      case "2" -> {
                        System.out.println("Entering Radio feature...");
                      }
                      case "3" -> {
                        System.out.println("Entering Recorder feature...");
                      }
                      case "4" -> {
                        System.out.println("Entering Track list feature...");
                      }
                      case "0" -> {
                        System.out.println("Returning to the parent menu...");
                      }
                      default -> {
                        System.out.println("Invalid choice. Please choose correctly!!");
                      }
                    }
                  }
                  
                case "9" -> {
          
                  System.out.println("Entering Games feature...");
                }
                
                case "10" -> {
          
                  System.out.println("Entering Calculator feature...");
                }
                  
                case "11" -> {
          
                  System.out.println("Entering Calculator feature...");
                }
                
                case "12" -> {
          
                   String clock = """
                        ===== Clock =======================
                        
                          1. Alarm clock
                          2. Clock settings
                          3. Date setting
                          4. Stopwatch
                          5. Countdown timer
                          6. Auto update of date and time
                                                    
                        ===================================
                        """;
                        System.out.print(clock);
                        System.out.println("Enter a choice number in the menu: ");
                        String clockMenu = input.nextLine();
                        
                        switch (clockMenu) {
                          case "1" -> {
                            System.out.println("Entering Alarm clock feature...");
                          }
                          case "2" -> {
                            System.out.println("Entering Clock settings feature...");
                          }
                          case "3" -> {
                            System.out.println("Entering Date setting feature...");
                          }
                          case "4" -> {
                            System.out.println("Entering Stopwatch feature...");
                          }
                          case "5" -> {
                            System.out.println("Entering Countdown timer feature...");
                          }
                          case "6" -> {
                            System.out.println("Entering Auto update of date and time feature...");
                          }
                          case "0" -> {
                            System.out.println("Returning to the parent menu...");
                          }
                          default -> {
                            System.out.println("Invalid choice. Please choose correctly!!");
                          }
                        }
                      }
                
                case "13" -> {
          
                  System.out.println("Entering Profile  feature...");
                }
                    
                case "14" -> {
          
                  System.out.println("Entering Service feature...");
                }
                  
                case "15" -> {
          
                  System.out.println("Entering SIM service  feature...");
                }
                
                default -> {
          
                  System.out.println("Invalid choice. Please, choose correctly!!");
                }
            }  
        }   		
    }

