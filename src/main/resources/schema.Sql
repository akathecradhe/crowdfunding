CREATE TABLE `fundraiser` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `BANKDETAILS` VARCHAR(45) NULL,
  `EMAIL` VARCHAR(45) NULL,
  `LOCATION` VARCHAR(45) NULL,
  `NAME` VARCHAR(45) NULL,
  `PURPOSE` VARCHAR(500) NULL,
  `targetAmount` INT NOT NULL,
  `targetDate` DATE NOT NULL,
  `currentAmount` INT ,
  PRIMARY KEY (`id`));


CREATE TABLE `contributionForm` (
                                    `id` INT NOT NULL AUTO_INCREMENT,
                                    `name` VARCHAR(45) NULL,
                                    `email` VARCHAR(45) NULL,
                                    `amount` INT NOT NULL,
                                    `accountNumber` INT NOT NULL,
                                    PRIMARY KEY (`id`));



