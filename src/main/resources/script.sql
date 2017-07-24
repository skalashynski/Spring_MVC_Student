CREATE SCHEMA `university` DEFAULT CHARACTER SET utf8 ;
CREATE TABLE `university`.`students` (
  `id` BIGINT NOT NULL,
  `ssn` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `surname` VARCHAR(45) NULL,
  `birthday` DATE NULL,
  `startStudyDate` DATE NULL,
  `endStudyDate` DATE NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `receivePaper` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;
INSERT INTO `university`.`students` (`id`, `ssn`, `name`, `surname`, `birthday`, `startStudyDate`, `endStudyDate`, `username`, `password`, `receivePaper`, `gender`, `country`) VALUES ('1', '1', 'Siarhei', 'Kalashynski', '1997-03-17', '2014-08-20', '2018-06-30', 'Siarhei_Kalashynski', 'password', 'yes', 'M', 'Belarus');
