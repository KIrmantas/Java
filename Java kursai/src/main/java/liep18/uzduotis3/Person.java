package liep18.uzduotis3;

public class Person {
    private int age;
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String education;

    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Person(int age, String firstName, String lastName, String country, String gender, String
            education) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.gender = gender;
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    public static class Builder{
        private int age;
        private String firstName;
        private String lastName;
        private String country;
        private String gender;
        private String education;

        private Builder() {
        }

        public Person build() {
            Person person = new Person();
            person.age = this.age;
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.country = this.country;
            person.gender = this.gender;
            person.education = this.education;
            return person;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEducation(String education) {
            this.education = education;
            return this;
        }

    }

}

/*
public class Person {
  private int age;
  private String firstName;
  private String lastName;
  private String country;
  private String gender;
  private String education;
  public Person(
      int age, String firstName, String lastName, String country, String gender, String education) {
    this.age = age;
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
    this.gender = gender;
    this.education = education;
  }
  public Person() {}
  public int getAge() {
    return age;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getCountry() {
    return country;
  }
  public String getGender() {
    return gender;
  }
  public String getEducation() {
    return education;
  }
  @Override
  public String toString() {
    return "Person{"
        + "age="
        + age
        + ", firstName='"
        + firstName
        + '\''
        + ", lastName='"
        + lastName
        + '\''
        + ", country='"
        + country
        + '\''
        + ", gender='"
        + gender
        + '\''
        + ", education='"
        + education
        + '\''
        + '}';
  }
  public static class Builder {
    private int age;
    private String firstName;
    private String lastName;
    private String country;
    private String gender;
    private String education;
    private Builder() {}
    public static Builder newBuilder() {
      return new Builder();
    }
    public Person build() {
      Person person = new Person();
      person.age = this.age;
      person.country = this.country;
      person.firstName = this.firstName;
      person.lastName = this.lastName;
      person.gender = this.gender;
      person.education = this.education;
      return person;
    }
    public Builder setAge(int age) {
      this.age = age;
      return this;
    }
    public Builder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }
    public Builder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }
    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }
    public Builder setGender(String gender) {
      this.gender = gender;
      return this;
    }
    public Builder setEducation(String education) {
      this.education = education;
      return this;
    }
  }
}

 */