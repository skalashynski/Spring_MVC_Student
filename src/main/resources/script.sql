CREATE SCHEMA `university` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `university`.`students` (
  `id` BIGINT NOT NULL,
  `ssn` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `birthday` DATE NULL,
  `startStudyDate` DATE NULL,
  `endLocalDate` DATE NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `receivePaper` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
