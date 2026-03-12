package Response;

public class ApiResponse {
    private String status;
    private StudentResponse data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StudentResponse getData() {
        return data;
    }

    public void setData(StudentResponse data) {
        this.data = data;
    }
}