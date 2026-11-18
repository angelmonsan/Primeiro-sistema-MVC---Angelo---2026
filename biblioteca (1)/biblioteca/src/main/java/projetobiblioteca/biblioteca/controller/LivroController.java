package projetobiblioteca.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import projetobiblioteca.biblioteca.model.Livro;
import projetobiblioteca.biblioteca.model.Autor;
import projetobiblioteca.biblioteca.model.Categoria;
import projetobiblioteca.biblioteca.model.Usuario;
import projetobiblioteca.biblioteca.model.Emprestimo;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Categoria> categorias = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public LivroController() {

        livros.add(new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                "978-85-00-00000-0"
        ));

        livros.add(new Livro(
                "O Pequeno Príncipe",
                "Antoine de Saint-Exupéry",
                "978-85-08-00000-0"
        ));

        autores.add(new Autor(
                "Machado de Assis",
                "Brasileira"
        ));

        autores.add(new Autor(
                "Antoine de Saint-Exupéry",
                "Francesa"
        ));

        categorias.add(new Categoria(
                "Literatura Brasileira",
                "Livros de autores brasileiros."
        ));

        categorias.add(new Categoria(
                "Literatura Infantil",
                "Livros destinados ao público infantil."
        ));

        usuarios.add(new Usuario(
                "João Silva",
                "2025001",
                "joao@email.com"
        ));

        usuarios.add(new Usuario(
                "Maria Oliveira",
                "2025002",
                "maria@email.com"
        ));

        emprestimos.add(new Emprestimo(
                "Dom Casmurro",
                "João Silva",
                "10/11/2026",
                "24/11/2026"
        ));

        emprestimos.add(new Emprestimo(
                "O Pequeno Príncipe",
                "Maria Oliveira",
                "12/11/2026",
                "26/11/2026"
        ));
    }

    @GetMapping
    public String inicio() {
        return "livros/inicio";
    }

    @GetMapping("/lista")
    public String listar(Model model) {
        model.addAttribute("livros", livros);
        return "livros/lista";
    }

    @GetMapping("/cadastro")
    public String abrirCadastro(Model model) {
        model.addAttribute("livro", new Livro());
        return "livros/cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute Livro livro) {
        livros.add(livro);
        return "redirect:/livros/lista";
    }

    @PostMapping("/excluir/{indice}")
    public String excluir(@PathVariable int indice) {

        if (indice >= 0 && indice < livros.size()) {
            livros.remove(indice);
        }

        return "redirect:/livros/lista";
    }

    @GetMapping("/autores")
    public String listarAutores(Model model) {
        model.addAttribute("autores", autores);
        return "livros/autores";
    }

    @GetMapping("/categorias")
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categorias);
        return "livros/categorias";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarios);
        return "livros/usuarios";
    }

    @GetMapping("/emprestimos")
    public String listarEmprestimos(Model model) {
        model.addAttribute("emprestimos", emprestimos);
        return "livros/emprestimos";
    }
}
