package br.com.fiap.myPass.password;

import javax.annotation.processing.Generated;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "passwords")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Password {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String url;
    String username;
    String password;
}

