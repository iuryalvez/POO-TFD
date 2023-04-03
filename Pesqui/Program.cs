var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();

/*
namespace Pesqui
{
    public class Usuario
    {
        private int Id { get; }
        private string nome;
        private List<Turma> t_fav = new List<Turma>();
        private List<Publicacao> publicacoes = new List<Publicacao>();
        private List<Avaliacao> avaliacoes = new List<Avaliacao>();
        private static int cont = 0;

        public Usuario(string nome)
        {
            if (string.IsNullOrWhiteSpace(nome))
            {
                throw new ArgumentException("Nome para usuário inválido!", nameof(nome));
            }
            this.nome = nome;
            cont++;
            Id = int.Parse(DateTime.Now.Year.ToString() + cont.ToString().PadLeft(4, '0'));
        }

        public List<Turma> T_fav { get => t_fav; }

        public List<Publicacao> Publicacoes { get => publicacoes; }

        public List<Avaliacao> Avaliacoes { get => avaliacoes; }

        public string Nome
        {
            get { return nome; }
            private set
            {
                if (string.IsNullOrWhiteSpace(nome))
                {
                    Console.WriteLine("Nome para usuário inválido!");
                    return;
                }
                nome = value;
            }
        }

        public void AddPublicacao(Publicacao publicacao)
        {
            publicacoes.Add(publicacao);
        }
        public void RemovePublicacao(Publicacao publicacao)
        {
            publicacoes.Remove(publicacao);
        }
        public void AddTurmaFavorita(Turma turma)
        {
            t_fav.Add(turma);
        }
        public void RemovePublicacao(Turma turma)
        {
            t_fav.Remove(turma);
        }



    }

    public class Professor
    {
        private string nome;
        // private List<Instituto> institutos;
        private List<Turma> turmas = new List<Turma>();
        // private readonly ILogger logger; // propridade readonly só atribui valores dentro de construtores

        public Professor(string nome)
        { // O construtor!!
            if (string.IsNullOrWhiteSpace(nome))
            {
                throw new ArgumentException("Nome para professor inválido!", nameof(nome)); // nameof(nome) é equivalente à "nome"
            }
            this.nome = nome; // ao invés de usar o this, poderíamos renomear como "_nome"

            // this.logger = logger;

        }

        // propriedade nome. Get e Set automáticos
        public string Nome
        {
            get { return nome; }
            private set
            {
                if (string.IsNullOrWhiteSpace(value))
                {
                    // logger.Log($"Não é possível criar um nome sem caracteres válidos.");
                    Console.WriteLine("Nome para professor inválido!");
                    return;
                }
                nome = value;
            }
        }

        public List<Turma> Turmas { get { return turmas; } }

        public void AddTurma(Turma turma)
        {
            turmas.Add(turma); // implementar try catch
        }

        public void RemoverTurma(Turma turma)
        {
            turmas.Remove(turma); // implementar try catch
        }

    }

    public class Turma
    {
        private string nome;
        private Professor professor;
        private List<Avaliacao> avaliacoes = new List<Avaliacao>();
        private float notaMedia = new float();
        private string periodo;
        private static int contador = 0;

        public Turma(string nome, Professor professor, float nota, string periodo)
        {
            if (string.IsNullOrWhiteSpace(nome))
            {
                throw new ArgumentException("Nome para turma inválido!", nameof(nome)); // nameof(nome) é equivalente à "nome"
            }
            this.nome = nome;
            this.professor = professor;
            this.periodo = periodo;
            notaMedia = nota;
            contador++;
        }

        // implementando as propriedades de cada atributo:

        public string Nome
        {
            get => nome;
            private set
            {
                if (string.IsNullOrWhiteSpace(value))
                {
                    Console.WriteLine("Nome para turma inválido!");
                    return;
                }
                nome = value;
            }
        }

        public Professor Prof { get => professor; }

        public string Periodo { get { return periodo; } private set { periodo = value; } }
    }

    public class Publicacao
    {
        private string titulo;
        private Usuario Autor { get; }
        private string texto;
        private DateTime DataPublicacao { get; }

        public Publicacao(string titulo, Usuario autor, string texto)
        {
            this.titulo = titulo;
            Autor = autor;
            this.texto = texto;
            DataPublicacao = DateTime.Now;
        }

        public string Titulo { get => titulo; private set => titulo = value; }

        public string Texto { get => texto; private set => texto = value; }
    }

    public class Avaliacao : Publicacao
    {
        private float nota;

        public Avaliacao(string titulo, Usuario autor, string texto, float nota) : base(titulo, autor, texto)
        {
            this.nota = nota;
        }

        public float Nota { get => nota; private set => nota = value; }

    }
}
*/