CREATE TABLE `fundraiser` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `BANKDETAILS` VARCHAR(45) NULL,
  `EMAIL` VARCHAR(45) NULL,
  `LOCATION` VARCHAR(45) NULL,
  `NAME` VARCHAR(45) NULL,
  `PURPOSE` VARCHAR(500) NULL,
  `targetAmount` INT NOT NULL,
  `targetDate` DATE NOT NULL,
  `currentAmount` INT ,
  PRIMARY KEY (`ID`));


CREATE TABLE `CONTRIBUTION_FORM` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `name` VARCHAR(45) NULL,
                                    `email` VARCHAR(45) NULL,
                                    `amount` INT NOT NULL,
                                    `ACCOUNT_NUMBER` INT NOT NULL,
                                    `fundraiserid` INT NOT NULL,
                                    PRIMARY KEY (`id`));



