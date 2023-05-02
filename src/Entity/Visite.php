<?php

namespace App\Entity;

use App\Repository\VisiteRepository;
use ApiPlatform\Metadata\ApiResource;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: VisiteRepository::class)]
#[ApiResource]
class Visite
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\Column(length: 255)]
    private ?string $dateVisite = null;

    #[ORM\Column(length: 255)]
    private ?string $commentaire = null;

    #[ORM\ManyToOne(inversedBy: 'visites')]
    private ?User $User = null;

    #[ORM\ManyToOne(inversedBy: 'visites')]
    private ?Praticien $Praticien = null;

    #[ORM\ManyToOne(inversedBy: 'Visite')]
    private ?User $user = null;

    #[ORM\ManyToOne(inversedBy: 'visite')]
    private ?Praticien $praticien = null;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getDateVisite(): ?string
    {
        return $this->dateVisite;
    }

    public function setDateVisite(string $dateVisite): self
    {
        $this->dateVisite = $dateVisite;

        return $this;
    }

    public function getCommentaire(): ?string
    {
        return $this->commentaire;
    }

    public function setCommentaire(string $commentaire): self
    {
        $this->commentaire = $commentaire;

        return $this;
    }

    public function getUser(): ?User
    {
        return $this->User;
    }

    public function setUser(?User $User): self
    {
        $this->User = $User;

        return $this;
    }

    public function getPraticien(): ?Praticien
    {
        return $this->Praticien;
    }

    public function setPraticien(?Praticien $Praticien): self
    {
        $this->Praticien = $Praticien;

        return $this;
    }
}
