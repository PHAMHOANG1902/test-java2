package java2;

public class Contact {
    private String name;
    private String company;
    private String email;
    private String phone;

    public Contact(String name, String company, String email, String phone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Tên: " + name + "\n" +
                "Công ty: " + company + "\n" +
                "Email: " + email + "\n" +
                "Số điện thoại: " + phone;
    }
}

